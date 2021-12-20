job ('new dsl job'){
    discription ('this is a complete ASL project')
    scm{
        git ('https://github.com/comrider/ias-test.git',' master')
    }
    trigger{
        scm ( * * * * *)
    }
    steps{
        mvn('clean package','pom.xml')
    }
    publish{
        archiveArtifacts artifacts '**/*.war'
    }
}