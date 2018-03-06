import { Component, OnInit } from '@angular/core';
import { BookService } from '../bookservice';
import { Book } from '../book';

@Component({
  selector: 'app-delete-book',
  templateUrl: './delete-book.component.html',
  styleUrls: ['./delete-book.component.css']
})
export class DeleteBookComponent implements OnInit {


  constructor(private bookService:BookService) { }
  
  showDiv=true;
  book=new Book();
  deleteBook(id:number){
    this.showDiv=false;
    this.bookService.findBook(id).then(book=>this.bookService.deleteBook(book));
    console.log('--- Book '+JSON.stringify(this.book));
    console.log('Deleting for book id '+id+" book name "+this.book.title);
   // this.bookService.deleteBook(this.book);  
    }
   
  ngOnInit() {
  }
}
