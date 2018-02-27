import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildDataComponent } from './child-data.component';

describe('ChildDataComponent', () => {
  let component: ChildDataComponent;
  let fixture: ComponentFixture<ChildDataComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChildDataComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChildDataComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
