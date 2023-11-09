import { Component } from '@angular/core';
import { Contract } from '../contract/contract';
import { ContractService } from '../contract/contract.service';
import { MessageService } from 'primeng/api';

@Component({
  selector: 'app-contract-list',
  templateUrl: './contract-list.component.html',
  styleUrls: ['./contract-list.component.css'],
  providers: [MessageService]
})
export class ContractListComponent {
  contract!: Contract[];

  clonedContract: { [s: number]: Contract} ={};

  columnHeadContracts: string [] = ['Id contrato','Nombre producto','Fecha de inicio','Fecha de finalizacion','Estado del contrato','Id producto','Acciones'];

  constructor(private contractservice: ContractService, private messageService: MessageService){}

  private getContractId(){

  }

  onRowEditInit(contract: Contract) {
    this.clonedContract[contract.contractid as number] = { ...contract };
  }

  onRowEditSave(contract: Contract, index: number) {
      if (contract.contractdescription != '') {
          delete this.clonedContract[contract.contractid as number];
          this.messageService.add({ severity: 'success', summary: 'Success', detail: 'Contract is updated' });
      } else {
          this.contract[index] = this.clonedContract[contract.contractid as number];
          delete this.clonedContract[contract.contractid as number];
          this.messageService.add({ severity: 'error', summary: 'Error', detail: 'Invalid contract description' });
      }
  }

  onRowEditCancel(contract: Contract, index: number) {
      this.contract[index] = this.clonedContract[contract.contractid as number];
      delete this.clonedContract[contract.contractid as number];
  }

}
