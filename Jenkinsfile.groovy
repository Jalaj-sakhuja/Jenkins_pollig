pipeline {
	agent any
	stages {
		stage('Init') {
			steps{
				echo "Hello this is the initailization"
			}
		}	
		stage('Build') {
			steps {
				echo "Building the sample project"
			}
		}
		stage('Deploy'){
			steps {
				echo "Deploying in staging environment"
			}
		} 
	}
}
