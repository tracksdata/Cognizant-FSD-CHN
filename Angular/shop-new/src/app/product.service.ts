import { Injectable } from '@angular/core';
import { Http } from '@angular/http';
import 'rxjs/add/operator/map'

@Injectable()
export class ProductService {

  apiUrl: string = "http://localhost:8080/api/products";

  constructor(private _http: Http) { }

  loadAllProducts() {
    return this._http.get(this.apiUrl)
      .map(resp => resp.json())
  }

  loadReviews(prodId) {
    return this._http.get(this.apiUrl + `/${prodId}/reviews`)
      .map(resp => resp.json())
  }
  
  submitNewReview(prodId, newReview) {
    return this._http.post(this.apiUrl + `/${prodId}/reviews`, newReview)
      .map(resp => resp.json())
  }

}
