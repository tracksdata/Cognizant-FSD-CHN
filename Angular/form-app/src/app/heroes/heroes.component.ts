import { Component, OnInit } from '@angular/core';
import { Hero } from '../hero';

@Component({
  selector: 'app-heroes',
  templateUrl: './heroes.component.html',
  styleUrls: ['./heroes.component.css']
})
export class HeroesComponent implements OnInit {

  hero: Hero = {
    id: 10,
    name: 'Windstorm'
  };

  active=true;
  submited=false;
  onSubmit(){
    this.submited=true;
  }


  constructor() { }

  ngOnInit() {
  }

}
