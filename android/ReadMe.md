# Android SideDish Project

## SideDish 클론 프로젝트

앱에 로그인을 하면 간단한 메뉴 목록들이 나오며 이를 선택했을때 주문을 할 수 있는 앱입니다. 

---

## 팀 프로젝트 회의록

[Team Notion](https://www.notion.so/Team27-39689e4eba7843bda8b0d8d4e78e8191)
### 팀 프로젝트 회의록 구성
- 스크럼 회의록
- 팀 룰
- 깃 전략
- 일일 회고

---
## App 구동 화면

|로그인화면|캘린더 선택화면|위치선택화면|
|--------|--------|--------|
|<img src = "https://s3.us-west-2.amazonaws.com/secure.notion-static.com/9ba2fd57-f71e-4af3-9083-2c417415bd92/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220708%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220708T052204Z&X-Amz-Expires=86400&X-Amz-Signature=2b1da5854d65f6f6a8797f2afb0e85d91e139e858e206daabda441315f83c5de&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject" width="450" height="600"> |<img src = "https://s3.us-west-2.amazonaws.com/secure.notion-static.com/7c1702c8-5104-4925-8ea9-5e4fc887c150/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220708%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220708T051121Z&X-Amz-Expires=86400&X-Amz-Signature=d94690d07a6740064268a6c218a6dff7937fecbc1e989bffb20b80dcb19e99d5&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject" width="450" height="600"> |<img src = "https://s3.us-west-2.amazonaws.com/secure.notion-static.com/48fabf58-b275-4c0d-a74a-9340625dd72f/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220708%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220708T051137Z&X-Amz-Expires=86400&X-Amz-Signature=55e7db431a205797801abc98df552eeeb14ba3decba2327cbeb59c7799fcfede&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject" width="450" height="600">|

---

## 사용된 기술들

### 기본 라이브러리
- Android KTX
- AppCompat

### Network
- Okhttp3
- Retrofit 2

### Jetpack AAC
- Data Binding
- Lifecycles
- ViewModel

### DI
- Hilt

### Asynchronous Process
- Coroutine

### UI
- Material 디자인

### Image
- Glide

## Architecture - MVVM
- MVVM 구조를 선택하였습니다.
  ![Image](https://developer.android.com/topic/libraries/architecture/images/final-architecture.png?hl=ko)

---

## 기술적 도전

---
### OAuth 를 연결하여 DeepLink 사용하기
- OAuth 를 사용하여 로그인 인증을 하였습니다. OAuth 로그인을 하여야 앱을 실행 하여 메뉴 화면을 확인할 수 있습니다.
- OAuth 를 받아오는 부분에서 DeepLink를 활용하여 로그인화면에서 홈 화면으로 전환될 수 있도록 구성하였습니다.

---
### Coroutine, LiveData 활용
- Coroutine을 활용하여 메뉴사진들을 서버에서 가져올 수 있었습니다. 또한 메뉴의 모든 데이터를 순서에 맞게 가져오기 위해서
각 메뉴의 정보를 순서에 맞게 가져오도록 하였습니다.
- LiveData를 활용하여 데이터를 viewModel에서 관리하며 View에 연결될 수 있도록 하였습니다.

---
### Navigation BackStack 관리
- Navigation 을 통한 Fragment전환 과정에서 로그인 Fragment가 백스택에 쌓이지 않도록 수정하였습니다.
- Fragment를 활용할 시에 BackStack에 Fragment가 어떻게 쌓이는지 알 수 있는 기회였습니다.

---
### MVVM 및 클린 아키텍쳐
- 비즈니스 로직이 변경될 가능성이 큰 데이터 레이어, UI레이어로 구분하여 결합도를 낮추기 위해서 MVVM 패턴을 채택하였습니다. 또한 ViewModel과 View 가 서로의 역할을 잘 가질 수 있도록 노력하였습니다.

---

## 팀 구성원

### Backend

- 산토리
- 루시드

### Android

- 조시
- 퍼니
