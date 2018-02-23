import { Injectable } from '@angular/core';
import { Http,Headers } from '@angular/http';
import 'rxjs/add/operator/toPromise';
import { Book } from './book';


@Injectable()
export class BookService {
  private headers = new Headers({ 'Content-Type': 'application/json' });
  private booksUrl = 'http://localhost:3000/api/books';

  getMessage():string{
    return "Message from Service";
  }
  constructor(private http:Http) { }

  getBooks(): Promise<Book[]> {
    return this.http.get(this.booksUrl)
      .toPromise()
      .then(response => response.json() as Book[])
      .catch(this.handleError);
      
  }

  getBook(id: string): Promise<Book> {
    const url = `${this.booksUrl}/${id}`;
    alert('--- in get book: '+url);
    return this.http.get(url)
      .toPromise()
      .then(response => response.json() as Book)
      .catch(this.handleError);
  }


  saveBook(book: Book): Promise<Book> {
    console.log('----- Service: '+book);
    return this.http
      .post(this.booksUrl, book, { headers: this.headers })	
      .toPromise()
      .catch(this.handleError);
  }


  updateBook(book: Book): Promise<Book> {
    const url = `${this.booksUrl}/${book.id}`;
    console.log('--service: id: '+book.id+" and title "+book.bookName);
    return this.http
      .put(url,book,{ headers: this.headers })
      .toPromise()
      .then(() => book)
      .catch(this.handleError);
  }

  deleteBook(book: Book): Promise<void> {
    const url = `${this.booksUrl}/${book.id}`;
    console.log('---> Delete: '+url);
    return this.http.delete(url, { headers: this.headers })
      .toPromise()
      .then(() => null)
      .catch(this.handleError);
  }

  private handleError(error: any): Promise<any> {
    console.error('An error occurred', error);
    return Promise.reject(error.message || error);
  }

}
