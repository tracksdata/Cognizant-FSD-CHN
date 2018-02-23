import { Http } from '@angular/http';
import { Injectable } from '@angular/core';
import { Book } from './book';
@Injectable()
export class BookService{

    apiUrl='';
    private headers = new Headers({ 'Content-Type': 'application/json' });
    constructor(private http:Http){}

    listAllBooks():Promise<Book[]>{
        return this.http.get(this.apiUrl)
        .toPromise().then(response=> response.json() as Book)
        .catch(this.handleError);
    }
    private handleError(error: any): Promise<any> {
        console.error('An error occurred', error);
        return Promise.reject(error.message || error);
      }

}