import { QuestionService } from './../services/question.service';
import { error } from '@angular/compiler-cli/src/transformers/util';
import { ActivatedRoute, Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import {FormGroup,FormControl,FormsModule} from '@angular/forms';

@Component({
  selector: 'app-add-question',
  templateUrl: './add-question.component.html',
  styleUrls: ['./add-question.component.css']
})
export class AddQuestionComponent implements OnInit {
  testId:number;
  public question:any={};

  constructor(private route:ActivatedRoute,private router:Router,
  private questionService:QuestionService) {
    this.route=route;
    this.router=router;
    this.questionService=questionService;

   }

  ngOnInit() {
    // this.testId=+this.route.snapshot.paramMap.get('tid');
    // console.log(this.testId)
  }

  // addQuestion(question:Question)
  // {
  //   console.log(this.testId);
  //   console.log(question);
  //   this.questionService.addQuestion(question,this.testId).subscribe(
  //     data=>{
  //       console.log(data);
  //     },
  //     error=>{
  //       console.log(error)
  //     }
  //   );
  //   this.router.navigate([])
  // }



}
