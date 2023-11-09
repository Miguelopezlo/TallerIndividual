import { Component } from '@angular/core';
import { MenuItem } from 'primeng/api/menuitem';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {
  modelo: MenuItem[];
  ngOnInit(){
    this.modelo=[
      {
        label: 'Admin',
        icon: 'pi pi-fw pi-user',
      }
    ];
  }
}
