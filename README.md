Objective
The main objective of this project is to learn about microservices and how they work while building a scalable application that manages quizzes and their related questions. The architecture includes:

QuizService: Manages different quizzes.
QuestionService: Handles questions related to specific quizzes.
Eureka Server: Registers services for easy discovery.
API Gateway: Centralizes access to the services.
Functionality:

Created CRUD APIs for quizzes and questions, testing them successfully.
Used OpenFeign to allow QuizService to call QuestionService for fetching related questions.
Registered both services on the Eureka Server with one instance of QuizService and two instances of QuestionService for load balancing.
Implemented an API Gateway to simplify access since the services run on different ports and URIs.
This experience helped me understand the principles of microservices, service communication, and how to build resilient applications.
