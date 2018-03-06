import { Routes } from '@angular/router';
import { AddBookComponent } from './add-book/add-book.component';
import { ListBooksComponent } from './list-books/list-books.component';
import { FindBookComponent } from './find-book/find-book.component';
import { UpdateBookComponent } from './update-book/update-book.component';
import { DeleteBookComponent } from './delete-book/delete-book.component';
import { FindbyTitleComponent } from './findby-title/findby-title.component';
export const myroutes:Routes=[
    {path:'addbook',component:AddBookComponent},
    {path:'listbooks',component:ListBooksComponent},
    {path:'findbook',component:FindBookComponent},
    {path:'updatebook',component:UpdateBookComponent},
    {path:'deletebook',component:DeleteBookComponent},
    {path:'findbytitle',component:FindbyTitleComponent},

]
