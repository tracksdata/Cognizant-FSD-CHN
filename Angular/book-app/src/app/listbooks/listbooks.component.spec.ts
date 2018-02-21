import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListbooksComponent } from './listbooks.component';

describe('ListbooksComponent', () => {
  let component: ListbooksComponent;
  let fixture: ComponentFixture<ListbooksComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListbooksComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListbooksComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
