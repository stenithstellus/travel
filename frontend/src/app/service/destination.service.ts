import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Destination } from '../class/destination';

@Injectable({
  providedIn: 'root'
})
export class DestinationService {
  
   public url='http://localhost:8081/api';
  constructor(private http:HttpClient) { } 

  getDestination():Observable<Destination[]>{
    return this.http.get<Destination[]>(`${this.url}/getDestination`);
  }
}
