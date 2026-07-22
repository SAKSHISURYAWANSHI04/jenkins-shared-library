def call(Map config) {
    pipeline {
        agent any

        stages {
            stage('Build') {
                steps {
                    echo "Building ${config.appName}"
                    sh '''
                        ls -la
                        test -f index.html
                        echo "Build Successful"
                    '''
                }
            }

            stage('Test') {
                steps {
                    echo "Testing ${config.appName}"
                }
            }

            stage('Scan') {
                steps {
                    echo "Scanning ${config.appName}"
                }
            }
stage('Deploy') {
    steps {
        echo "Deploying ${config.appName}"
        sh '''
            sudo cp index.html /var/www/html/
            sudo cp style.css /var/www/html/
            sudo cp script.js /var/www/html/
        '''
    }
}
            }
        }
    }
}
