import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FindbyTitleComponent } from './findby-title.component';

describe('FindbyTitleComponent', () => {
  let component: FindbyTitleComponent;
  let fixture: ComponentFixture<FindbyTitleComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FindbyTitleComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FindbyTitleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
