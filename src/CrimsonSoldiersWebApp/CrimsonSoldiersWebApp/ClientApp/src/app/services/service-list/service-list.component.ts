import { Component, OnInit } from '@angular/core';
import { ServiceRequest } from '../shared/service-request';
import { ServiceModel } from '../shared/service.model';

@Component({
  selector: 'app-service-list-component',
  templateUrl: './service-list.component.html'
})
export class ServiceListComponent implements OnInit {
  services: ServiceModel[];
  loading: boolean = true;
  display: boolean = false;
  service: ServiceModel = {
    id: 0,
    name: '',
    location: '',
    hours: '',
    phoneNumber: '',
    email: '',
    imageUrl: '',
    shortDescription: '',
    longDescription:'',
  };

  constructor(private serviceRequest: ServiceRequest) { }

  ngOnInit() {
    this.serviceRequest.getServiceListing()
      .subscribe(data => {
        this.services = data;
        this.loading = false;
      })
  }

  select(item: ServiceModel) {
    console.log(item);
    this.service = item;
    this.showDialog();
  }

  showDialog() {
    this.display = true;
  }
}
