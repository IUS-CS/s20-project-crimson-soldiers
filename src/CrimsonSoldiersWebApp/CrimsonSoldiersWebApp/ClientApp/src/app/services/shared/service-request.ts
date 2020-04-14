import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ServiceModel } from './service.model';

@Injectable({ providedIn: 'root' })
export class ServiceRequest {
  serviceUrl = 'api/service';

  constructor(private http: HttpClient) { }

  getServiceListing(): Observable<ServiceModel[]> {
    return this.http.get<ServiceModel[]>(this.serviceUrl)
  }
}
