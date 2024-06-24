//Irrespective of first stage output ,second post will always be exceuted. Generally error in first stage results into unexecution of stges follwing that stage , this can be avoided using always keyword like this: 

pipeline{
    agent any

    stages {
        stage('Example') {
            steps{
               icho "Hello Hii!!" //Intentionally making mistake to check further execution.
            }
        }
    }
    post{
        always{
            echo 'I will alway be happy!!'
        }
    }
}

