import { Http } from '@angular/http';
import { Injectable } from '@angular/core';
import { Book } from './book';
import 'rxjs/add/operator/toPromise';
@Injectable()
export class BookService{

    apiUrl='http://localhost:8080/getBooks';

    private headers = new Headers({ 'Content-Type': 'application/json' });
    constructor(private http:Http){}

    listAllBooks():Promise<Book[]>{
        return this.http.get(this.apiUrl)
        .toPromise().then(response=> response.json() as Book)
        .catch(this.handleError);
    }

   addBook(book:Book):Promise<Book>{
    return this.http
      .post(this.apiUrl,book)	
      .toPromise()
      .catch(this.handleError);
   }

   findBook(id:string):Promise<Book>{
    const url = `${this.apiUrl}/${id}`;
        return this.http.get(url)
        .toPromise()
        .then(response => response.json() as Book)
        .catch(this.handleError);
   }

   updateBook(book: Book): Promise<Book> {
    const url = `${this.apiUrl}/${book.id}`;
    console.log('--service: id: '+book.id+" and title "+book.title);
    return this.http
      .put(url,book)
      .toPromise()
      .then(() => book)
      .catch(this.handleError);
  }

  deleteBook(book: Book): Promise<void> {
    const url = `${this.apiUrl}/${book.id}`;
    console.log('---> Delete: '+url);
    return this.http.delete(url)
      .toPromise()
      .then(() => null)
      .catch(this.handleError);
  }

    private handleError(error: any): Promise<any> {
        console.error('An error occurred', error);
        return Promise.reject(error.message || error);
      }

}