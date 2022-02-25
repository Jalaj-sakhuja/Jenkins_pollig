job("First job via DSL"){
	description("First project to generate by DSL ${new Date()}")
	scm{
		git("https://github.com/anshulc55/Jenkins_Upgradev3.git", "any")
	}
	steps{
		maven("clean package", "java-tomcat-sample/pom.xml")
	}
	publishers{
		archiveArtifacts "**/*.jar"
	}

}
