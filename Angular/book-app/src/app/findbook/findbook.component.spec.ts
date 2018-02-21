import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FindbookComponent } from './findbook.component';

describe('FindbookComponent', () => {
  let component: FindbookComponent;
  let fixture: ComponentFixture<FindbookComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FindbookComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FindbookComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
