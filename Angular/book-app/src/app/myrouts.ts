import { AddbookComponent } from './addbook/addbook.component';
import { Routes } from '@angular/router';
import { ListbooksComponent } from './listbooks/listbooks.component';
import { FindbookComponent } from './findbook/findbook.component';
import { UpdatebookComponent } from './updatebook/updatebook.component';
import { DeletebookComponent } from './deletebook/deletebook.component';

export const myrouters:Routes=[
    {path:'addbook',component:AddbookComponent},
    {path:'listbooks',component:ListbooksComponent},
    {path:'findbook',component:FindbookComponent},
    {path:'updatebook',component:UpdatebookComponent},
    {path:'deletebook',component:DeletebookComponent},
]