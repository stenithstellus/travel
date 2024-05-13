import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { About } from '../class/about';

@Injectable({
  providedIn: 'root'
})
export class AboutService {

   private url='http://localhost:8081/api';
  constructor(private http:HttpClient) { }

  getAbout():Observable<About[]>{
    return this.http.get<About[]>(`${this.url}/getAbout`);
  }
}
