# LiftBook
Backend of workout tracking app

Liftbook is a web application that helps you to track your workouts. The main goal of the app is to quickly store workout history. It also has simple social features that allow of sharing results and communicating with other users.

# Technology stack
- Java
- Spring Boot
- Hibernate
- JUnit

# Main features

- Register & Log in
- Change password

- Show workouts (monthly view, yearly view)
- Show news (friends' workouts)
- Add workout from scratch (exercises, sets, weight, repetitions, rest time, duration, gym)
- Add workout from template (choose existing workout and make changes)
- Create workout template
- Add exercise (name, description, picture)
- Show friends list
- Find friends by nickname or city
- Show workout stats (general)
- Exporting workout data to pdf

# Extra features
- Like and comment friends' workouts
- Multilanguage (second language - Polish, change in profile settings)
- Different weight units (kg/lbs) set in profile settings
- User profile picture add/change
- Placeholder for YT video of an exercise
- Find the friend easily - generate & scan QR code
- Request adding exercise and gyms to verified (CAPTCHA to prevent bot requests)
- Admin panel for accepting verifications (exercise, gym)
- Choose templates for recent templates list
- Show friend's profile
- Show friend's friends (public/private list - change in profile settings)
- Limit export by dates range
- Limit workout data in export

## Commit prefixes:

- feat(task_no): The new feature you're adding to a particular application
- fix(task_no): A bug fix
- style(task_no): Feature and updates related to styling
- refactor(task_no): Refactoring a specific section of the codebase
- test(task_no): Everything related to testing
- docs(task_no): Everything related to documentation
- chore(task_no): Regular code maintenance. [ You can also use emojis to represent commit types]


## Code standards

- Boolean attributes names end with `Flag`
- Always use UUID Generator (https://www.uuidgenerator.net/version4) for UUID generation
- Pay attention to SonarLint suggestions
- Before merging to `master`: `mvn spotless:apply` in order to maintain code formatting and minimizing merge conflicts

## Useful commands

- Building docker image locally: `docker build -t liftbook-api .`
- Running docker image locally: `docker run --name liftbook-api -p 8080:8080 liftbook-api`
