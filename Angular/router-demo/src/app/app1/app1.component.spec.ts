import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { App1Component } from './app1.component';

describe('App1Component', () => {
  let component: App1Component;
  let fixture: ComponentFixture<App1Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ App1Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(App1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
