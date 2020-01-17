import { QuestionService } from './../services/question.service';
import { TestService } from './../services/test.service';
import { SubjectService } from './../services/subject.service';
import { Subject } from './../model/subject';
import { Question } from './../model/question';
import { Test } from './../model/test';
import { Router } from '@angular/router';
import { error } from '@angular/compiler-cli/src/transformers/util';
import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, FormsModule } from '@angular/forms';

@Component({
  selector: 'app-view-all',
  templateUrl: './view-all.component.html',
  styleUrls: ['./view-all.component.css']
})
export class ViewAllComponent implements OnInit {
  subjects: any = [];
  tests: Test[] = [];
  questions: Question[] = [];
  subject: Subject;
  flag: boolean = true;
  qFlag: boolean = false;
  test: Test;
  testId: number;
  questionId: number;
  formQuesFlag: boolean = true;
  enableQuestId: any;
  public question: any = {};

  constructor(private subjectService: SubjectService,
    private testService: TestService,
    private questionService: QuestionService,
    private router: Router) {
    this.subjectService = subjectService;
    this.testService = testService;
    this.questionService = questionService;
  }

  ngOnInit() {
    this.getAllSubject();
  }

  getAllSubject() {
    this.subjectService.getAllSubject().subscribe(
      data => {
        this.subjects = data;
      },
      error => {
        console.log(error);
      }
    );


  }
  getTestListBySubject(subjectId) {
    if (subjectId > 0) {
      this.flag = false;
      this.testService.getAllTestBySid(subjectId)
        .subscribe(
        data => {

          this.tests = data;
        },
        error => {
          console.log(error);
        }
        );
    }
  }

  getQuestionsByTid(tid) {
    if (tid > 0) {
      this.qFlag = true;
      this.testId = tid;
      this.questionService.getAllQuestionByTID(tid).
        subscribe(
        data => {
          this.questions = data;
        },
        error => {
          console.log(error);
        }
        );
    }

  }

  getQuestionForm(tid) {

    this.testId = tid;
    if (this.formQuesFlag == true)
      this.formQuesFlag = false;
    else
      this.formQuesFlag = true;


    //  this.router.navigate(['/add-question', tid]);
  }
  addQuestion(question: Question) {
    console.log(this.testId);
    console.log(question.questionId);

    this.questionService.addQuestion(question, this.testId).subscribe(
      data => {
        console.log(data);
      },
      error => {
        console.log(error)
      }
    )
    this.formQuesFlag = true;
    //this.router.navigate([''])
  }

  deleteQuestion(questionId) {
    console.log(questionId)
    console.log(this.testId)
    this.questionService.deleteQuestion(questionId, this.testId).subscribe(
      data => {
        console.log(data);
      },
      e => [
        console.log(e)
      ]
    )
  }
  updateQuestion(question: Question, questionId: number) {
    this.questionId = questionId;
    console.log(question.questionName)

    this.questionService.updateQuestion(question, this.questionId, this.testId).subscribe();
  }

  editQuestion(question: Question) {
    this.enableQuestId = question.questionId;
  }

  cancel() {
    this.enableQuestId = null;
  }

  logOut() {
    sessionStorage.removeItem('username')
  }

}
