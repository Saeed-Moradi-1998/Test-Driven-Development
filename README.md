## Project Details
The project has two branches: main and mockito. All the code is implemented in the main branch except for the last question, which was about mocking one of the methods to test.
## Running the project
First, you need to make sure you are on the main branch. If you are cloning the repository, make sure you are cloning the main branch. If there is any doubt, run the following command to switch between branches.

git checkout BRANCH_NAME(mockito/main) 

To check if you are on the right branch

git branch

After this step, you need to go to the project root (where the pom.xml file is located), and run the following command:

mvn package

to check the mutation and code coverage scores, run the command below on the root of the project:\

mvn clean test org.pitest:pitest-maven:mutationCoverage
