import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Login } from '../Model/login';
import { Observable } from 'rxjs';
import { LoginComponent } from '../Components/login/login.component';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

private getUrl: string ="http://localhost:8080/api";

  constructor(private http: HttpClient) { }

  saveLogin(login : Login): Observable<Login>{
    return this.http.post<Login>(this.getUrl, login);
  }
}
