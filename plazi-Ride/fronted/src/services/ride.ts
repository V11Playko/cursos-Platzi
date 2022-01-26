import { Injectable } from "@angular/core";
import { HttpClient } from '@angular/common/http';

@Injectable()
export class RideService {
    private url = 'http://localhost:1337/ride';
    constructor {
        private http: HttpClient
    } {

    }
}