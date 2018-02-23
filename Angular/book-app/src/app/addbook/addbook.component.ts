import { BookService } from './../bookservice';
import { Book } from './../book';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-addbook',
  templateUrl: './addbook.component.html',
  styleUrls: ['./addbook.component.css']
})
export class AddbookComponent implements OnInit {

public newBook=new Book();

constructor(private bookService:BookService) { }

saveBook(book:Book){
 this.bookService.saveBook(book);
 this.clearFields();
}

clearFields(){
  this.newBook.bookId=undefined;
  this.newBook.bookName='';
  this.newBook.author='';
}

  ngOnInit() {
    
  }

}
