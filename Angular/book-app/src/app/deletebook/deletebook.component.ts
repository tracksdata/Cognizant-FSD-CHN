import { BookService } from './../bookservice';
import { Component, OnInit } from '@angular/core';
import { Book } from '../book';

@Component({
  selector: 'app-deletebook',
  templateUrl: './deletebook.component.html',
  styleUrls: ['./deletebook.component.css']
})
export class DeletebookComponent implements OnInit {

book:Book;
books:Book[];
msg:string;
id:number;
result=false;
  constructor(private bookService:BookService) { }
  deleteBook(id:string){
    alert(' from HTML Selected id is '+id);
   for(let bk of this.books){
      if(bk.id==id){
        this.book=bk;
      }
   }
    //this.bookService.getBook(id).then(book=>this.book=book); 
   // alert('-- Book Name: '+this.book.bookName);
    this.bookService.deleteBook(this.book);
    this.msg='Book Name '+this.book.bookName+' deleted successfully';
    
    this.result=true;
    this.bookService.getBooks().then(books=>this.books=books);

  }
   
  ngOnInit() {
    this.bookService.getBooks().then(books=>this.books=books);
  }

}
