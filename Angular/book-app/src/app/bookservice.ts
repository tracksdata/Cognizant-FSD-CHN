import { Injectable } from '@angular/core';
import { Http,Headers } from '@angular/http';
import 'rxjs/add/operator/toPromise';
import { Book } from './book';


@Injectable()
export class BookService {
  private headers = new Headers({ 'Content-Type': 'application/json' });
  private booksUrl = 'http://localhost:9090/Spring-Rest';

  getMessage():string{
    return "Message from Service";
  }
  constructor(private http:Http) { }

  getBooks(): Promise<Book[]> {
    return this.http.get(this.booksUrl + "/book")
      .toPromise()
      .then(response => response.json() as Book[])
      .catch(this.handleError);
      
  }

  getBook(id: number): Promise<Book> {
    const url = `${this.booksUrl}/book/${id}`;
    return this.http.get(url)
      .toPromise()
      .then(response => response.json() as Book)
      .catch(this.handleError);
  }


  saveBook(book: Book): Promise<Book> {
    console.log('----- Service: '+book);
    return this.http
      .post(this.booksUrl + "/book", book, { headers: this.headers })	
      .toPromise()
      .catch(this.handleError);
  }

  updateBook(book: Book): Promise<Book> {
    const url = `${this.booksUrl}/book/${book.id}`;
    console.log('--service: id: '+book.id+" and title "+book.title);
    return this.http
      .put(url,book,{ headers: this.headers })
      .toPromise()
      .then(() => book)
      .catch(this.handleError);
  }

  deleteBike(book: Book): Promise<void> {
    const url = `${this.booksUrl}/book/${book.id}`;
    return this.http.get(url, { headers: this.headers })
      .toPromise()
      .then(() => null)
      .catch(this.handleError);
  }

  private handleError(error: any): Promise<any> {
    console.error('An error occurred', error);
    return Promise.reject(error.message || error);
  }

}
