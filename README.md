# Introduction #

_Maven For Enterprise_ is an example how to configure and manage Maven projects in the enterprise environment. When Maven is used to build hundreds of projects, managed by various development, testing and operations teams we need enterprise Maven environment. Mature enterprise environment built around Maven is the best method to improve software quality.

# Maven For Enterprise #

_Maven For Enterprise_ has been built based on years of experiences in a large software company.  The following aspects are addressed in the project:

  * Corporate POM
  * Continuous integration
  * Deployment automation
  * Release management
  * Reporting (documentation, code quality and coverage metrics)
  * Enterprise repository
  * Enterprise archetypes

# Project Purposes #

  * The project has been created as an evaluation area, where new tools, configuration and processes can be safely tested.
  * The project collects best practices from various sources (own experiences, books, blogs, articles and presentations) into single working project.
  * Proprietary project can not be referred publicly. This project can be easily referred in the mailing lists and bug trackers.
  * And last but not least: feedback from community cannot be overestimated.

# Components #

## Corporate POM ##

Real world example of Corporate POM. The example could be (and is) easily adopted into any Maven enterprise environment. The Corporate POM is designed for extensibility and maintainability.

## Simple WAR ##

J2EE 1.4 compatible web project organized as single module Maven project. _Simple WAR_ project is fully working example, use `mvn tomcat6:run` command to run the application.

## Modular WAR ##

J2EE 1.4 compatible web project organized as multi module Maven project. _Modular WAR_ project is fully working example, use `mvn -pl modular-war-webapp tomcat6:run -am` command to run the application.

# Documentation #

GettingStarted with _Maven For Enterprise_.


---


Enjoy,

_Maven For Enterprise Team_