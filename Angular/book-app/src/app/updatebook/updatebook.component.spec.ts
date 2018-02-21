import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdatebookComponent } from './updatebook.component';

describe('UpdatebookComponent', () => {
  let component: UpdatebookComponent;
  let fixture: ComponentFixture<UpdatebookComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UpdatebookComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdatebookComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
