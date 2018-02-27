import { Component } from '@angular/core';
import { ProductService } from './product.service';

@Component({
  selector: 'shop-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [
    ProductService
  ]
})
export class AppComponent {

  title: string = 'NG-shop-v2';
  cart: Array<any> = [];
  products: Array<any> = [];

  // private productService: ProductService;
  // constructor(productService: ProductService) {
  //   this.productService = productService;
  // }

  constructor(private productService: ProductService) { };

  ngOnInit() {
    this.productService.loadAllProducts()
      .subscribe((products) => {
        console.log(products);
        this.products = products;
      })
  }

  addToCart(event) {
    this.cart.push(event.product);
  }

}
