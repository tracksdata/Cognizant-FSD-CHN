import { Component, OnInit, Input } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms'
import { ProductService } from '../product.service';

@Component({
  selector: 'app-review-form',
  templateUrl: './review-form.component.html',
  styleUrls: ['./review-form.component.css']
})
export class ReviewFormComponent implements OnInit {

  @Input() product: any;

  isOpen: boolean = false
  reviewForm: FormGroup;

  constructor(private fb: FormBuilder, private productService: ProductService) { }

  ngOnInit() {
    this.reviewForm = this.fb.group({
      stars: ['1'],
      author: ['', [Validators.required, Validators.email]],
      body: ['', [Validators.required]]
    });
  }

  toggleForm() {
    this.isOpen = !this.isOpen
  }
  submitNewReview(event) {
    if (this.reviewForm.valid) {
      this.productService.submitNewReview(this.product.id, this.reviewForm.value)
        .subscribe(review => {
          this.product.reviews.push(this.reviewForm.value);
          this.reviewForm.reset();
          this.toggleForm();
        })

    }

  }


}
