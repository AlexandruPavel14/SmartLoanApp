# SmartLoanAppClient - Web version

## Project Structure

- `public/`: Contains static files such as `index.html`, `manifest.json`, and `robots.txt`.
- `src/`: Contains the source code for the React application.
  - `App.js`: Main application component that sets up routing.
  - `App.test.js`: Contains tests for the `App` component.
  - `setupTests.js`: Sets up the testing environment.
  - `index.js`: Entry point of the React application.
  - `index.css`: Global CSS styles.
  - `App.css`: CSS styles for the `App` component.
  <!-- - `auth.js`: Handles user authentication (register, login, fetch welcome message). -->
  <!-- - `PrivateRoute.js`: Component for protecting routes that require authentication. -->
  
## Available Scripts

- `npm start`: Runs the app in development mode.
- `npm test`: Launches the test runner.
- `npm run build`: Builds the app for production.
- `npm run eject`: Ejects the app from Create React App configuration.

## Dependencies

- `axios`: For making HTTP requests.
- `react`: Core React library.
- `react-dom`: React library for DOM manipulation.
- `react-router-dom`: For routing in React applications.
- `react-scripts`: Scripts and configuration used by Create React App.
- `web-vitals`: For measuring performance metrics.

## Development

To start the development server, run:

```sh
npm run start
```

- Once started, the application will be available at:
    ```
    http://localhost:3000
    ```