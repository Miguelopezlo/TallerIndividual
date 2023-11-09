import { Component } from '@angular/core';
import { DropDownTextService } from '../services/drop-down-text.service';

@Component({
  selector: 'app-search-bar',
  templateUrl: './search-bar.component.html',
  styleUrls: ['./search-bar.component.css']
})
export class SearchBarComponent {
  dropdownOptions: object[];
  value: string;
  
  constructor(public dropService: DropDownTextService) {}
  
  ngOnInit() {
    // Subscribe to changes in the dropdown options
    this.dropService.dropdownOptionsChanged.subscribe((newOptions) => {
      this.dropdownOptions = newOptions;
    });
  }
}
