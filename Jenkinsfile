pipeline{
	agent any
	stages{
		stage('Init'){
			steps{
				scm{
					git("https://github.com/anshulc55/Jenkins_Upgradev3.git", "any")
				}
				maven("clean package", "java-tomcat-sample/pom.xml")
				echo "Hello this is the initailization"
			}
		}	
		stage('Build'){
			steps{
				echo "Building the sample project"
			}
		}
		stage('Deploy'){
			steps{
				echo "Deploying in staging environment"
			}
		} 
	}
}
