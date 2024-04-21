# Group Project

## Authors

* [Raj Patel](r.patel@dal.ca)
* [Rushikumar Patel](rs525735@dal.ca)
* [Nisarg Chudasama](ns458128@dal.ca)
* [Sumit Mansukhlal Savaliya](sm572004@dal.ca)
* [Vivek Alpeshbhai Sonani](viveksonani@dal.ca)
* [Roshni Joshi](rs888392@dal.ca)

## REPOSITORY LINKS

* *Date Created*: 27 FEB 2024
* *Last Modification Date*: 04 APR 2024
* *Deployed Application*: <https://main--hirex5709.netlify.app/>

## Deployment

We created a new private repository on github for project deployment and pushed our code to that repository. Then, we imported the frontend project on netlify from github and setup build settings to deploy the application. Similarly, we imported the backend projects on render from github and setup their build settings to deploy the applications. For deploying on render, we have created dockerfile in our projects. Finally, both our frontend and backend applications were deployed, and are live on the mentioned link.

Note: When using spring boot for the group project, render may occasionally shut down the service due to inactivity. Therefore, the first API request may take around 1 minute, but subsequent requests should work fine. Moreover, when we are connected to Dalhousie University wifi, our application deployed on render gives connection timeout error. However, the same application perfectly works fine when connected to our personal wifi or when running on localhost. Perhaps, there might be some network blocking from render's end or from Dalhousie wifi, which results into the issue. Hence, please consider connecting to your personal wifi network while testing our project submission. Meanwhile, we are in the process of communicating the issue with Dalhousie IT support team and trying to find the cause behind the issue.

## Built With

* [React](https://legacy.reactjs.org/docs/getting-started.html/) - The web framework used
* [npm](https://docs.npmjs.com//) - Dependency Management
* [Material](https://mui.com/material-ui/getting-started/) - Used for application CSS
* [Spring Boot](https://spring.io/projects/spring-boot) - The backend framework used
* [Java](https://www.java.com/) - The programming language used
* [Maven](https://maven.apache.org/) - Used as a build tool and for dependency management 
* [Docker](https://www.docker.com/) - Used for containerization
* [MongoDB](https://www.mongodb.com/atlas/database) - Database used

## Features

- **Code Assessments**: Enables automated coding tests for candidates, supporting various programming languages.
- **Video Interviews**: Offers a platform for conducting live video interviews, making remote hiring processes seamless.
- **Candidate Management**: Provides a robust system for tracking and managing candidate progress from application through to hiring.

## Prerequisites

Before setting up your instance of HireX, you'll need the following:
- [Node.js](https://nodejs.org/en/) and [npm](https://www.npmjs.com/)
- [Docker](https://www.docker.com/) (optional, for running the services in containers)

## Installation

### Local Frontend

The frontend of HireX is built with modern web technologies. To get it up and running on your local machine, follow these steps:

1. Navigate to the `frontend` directory:
   ```bash
   cd frontend
   npm install
   ```

2. Start the frontend application:
   ```
   npm start
   ```
   This will launch the HireX frontend on http://localhost:3000.

### Local Backend
The backend is organized into different modules for various functionalities. To set up the backend services, perform the following:

Navigate to the desired backend module directory (e.g., code-assessment, hire-x, video-interview):
bash
cd backend/<module-name>
Setup each module according to the specific instructions provided in its respective README file.

## Usage
With both frontend and backend services set up, you can access the HireX platform through the frontend URL: http://localhost:3000. This interface will allow you to manage all aspects of the hiring process, from initial candidate screening through final interviews.

## Acknowledgments

* Insights from the demo of the Tutorial - 4 were helpful in quickly creating navigations.
* Custum creative images in the Homepage were generated using Gemini AI.

