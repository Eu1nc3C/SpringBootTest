const taskControl = new TaskController();
let storeImage = ""


newTaskForm.addEventListener('submit', (event) => {
    // Prevent default action
    event.preventDefault();
    // Select the inputs
    const newTaskTitleInput = document.querySelector('#newTaskTitleInput');
    const newTaskDescription = document.querySelector('#newTaskDescription');
    const newTaskTargetDate = document.querySelector('#newTaskTargetDate');

    /*
        Do the Validation code here
    */

    // Get the values of the inputs - variable names to be same as MySQL columns
    const Title = newTaskTitleInput.value;
    const Description = newTaskDescription.value;
    const TargetDate = newTaskTargetDate.value;





    // Clear the form
    newTaskTitleInput.value = '';
    newTaskDescription.value = '';
    newTaskTargetDate.value = '';


    // Add the task to the task manager
    /*After we get al the values and object from the form we will
    */
   taskControl.addTask(Title, Description, TargetDate);

    });


