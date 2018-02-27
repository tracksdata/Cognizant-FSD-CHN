import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {


  @Input() product: any;
  @Input() idx: number;

  tab: number = 1;

  @Output() buy = new EventEmitter();


  constructor(private productService: ProductService) { }

  ngOnInit() {
  }

  hanldeTabChange($event: any, tabIdx: number) {
    this.tab = tabIdx;

    if (tabIdx === 3) {
      this.productService.loadReviews(this.product.id)
        .subscribe(reviews => {
          this.product.reviews = reviews
        });
    }

  }

  isTabSelected(tabIdx: number) {
    return this.tab === tabIdx;
  }

  handleBuyBtnClick() {
    this.buy.emit({ product: this.product });
  }


}
