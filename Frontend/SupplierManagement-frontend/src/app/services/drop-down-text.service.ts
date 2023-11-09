import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DropDownTextService {
  dropdownOptionsChanged = new Subject<object[]>();

  changeDropdownOptions(newOptions: object[]) {
    this.dropdownOptionsChanged.next(newOptions);
  }
}
