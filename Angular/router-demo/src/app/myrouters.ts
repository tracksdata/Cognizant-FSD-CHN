import { App3Component } from './app3/app3.component';
import { Routes } from '@angular/router';
import { App1Component } from './app1/app1.component';
import { App2Component } from './app2/app2.component';
import { App4Component } from './app4/app4.component';
import { App5Component } from './app5/app5.component';

export const myroutes:Routes=[
  {path:'app1',component:App1Component},
  {path:'app2',component:App2Component},
  {path:'app3',component:App3Component},
  {path:'app4',component:App4Component},
  {path:'app5',component:App5Component},
]