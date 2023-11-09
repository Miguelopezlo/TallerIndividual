import { Component } from '@angular/core';
import { MessageService } from 'primeng/api';
import { FileService } from './services/file.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [MessageService]
})
export class AppComponent {
  title = 'Sistema de gestión de proveedores';
  contents: any = null;
  filename: string;

  constructor(private fileService: FileService){}

  myUploader(event: { files: File[]; }, form: any) {
    console.log('Reading file...');
    let file = event.files[0];
    this.fileService.postSupplierList(file).subscribe(
      (result: any) => {
        console.log("Hola")
      }
    )
    form.clear();
  }

}
