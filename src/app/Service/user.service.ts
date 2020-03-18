import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Register } from '../models/register.model';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private baseUrl = 'http://localhost:8003/user';

  constructor(private http: HttpClient) { }

  firstname = '';
  username = '';
  id: number;
  email = '';

  // tslint:disable-next-line:ban-types
  createUser(user: Register): Observable<Object> {
    console.log(user);
    return this.http.post(`${this.baseUrl}` + `/create`, user);
  }

}
