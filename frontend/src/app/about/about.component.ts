import { Component } from '@angular/core';
import { AboutService } from '../service/about.service';
import { CommonModule } from '@angular/common';
import { HttpClientModule, provideHttpClient } from '@angular/common/http';
import { DestinationService } from '../service/destination.service';
import { response } from 'express';

@Component({
  selector: 'app-about',
  standalone: true,
  imports: [CommonModule,
    ],
  templateUrl: './about.component.html',
  styleUrl: './about.component.scss',
  providers: [   
  ] 
})
export class AboutComponent {
  About:any;
  Destination:any;
  constructor(private aboutservice:AboutService,private destinationservice:DestinationService){}

  ngOnInit(): void{
    this.getList();
    this.getallAbout();
  }
    
    getallAbout(){
      this.aboutservice.getAbout().subscribe(response=>{
        this.About=response;
        console.log(this.About);
      });
    }

    getList(){
      this.destinationservice.getDestination().subscribe(response=>{
        this.Destination=response;
        console.log(this.Destination);
      }
      )
    }
}
