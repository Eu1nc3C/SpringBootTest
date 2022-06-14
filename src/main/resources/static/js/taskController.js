//Doing a Product web app, in product page to
//display the name, description, imageUrl, style, price, ..., ...,.....,....


const createHTMLList = (Title, Description, TargetDate) =>
`


<table class="table">
    <thead>
        <tr>
            <th scope="col">Title</th>
            <th scope="col">Description</th>
            <th scope="col">Target Date</th>
        </tr>
    </thead>
    <tbody>
     <tr>
        <td>${Title}</td>
        <td>${Description}</td>
        <td>${TargetDate}</td>
     </tr>
    </tbody>
</table>





function displayTaskDetails(task)
{
    document.querySelector("#modalTitle").innerText = task.Title;
    document.querySelector("#modalDescription").innerText = task.Description;
    document.querySelector("#modalTargetDate").innerText = task.TargetDate;

}
  class ProductsController
    {
        constructor()
        {
            this._tasks = [];       //create an array to store the details of tasks
        }

        //method to add the tasks into the database
        addTask(Title, Description, TargetDate)
        {
            var taskController = this;
            const formData = new FormData();
            formData.append('Title', Name);
            formData.append('Description', Description);
            formData.append('TargetDate', TargetDate);

           fetch('http://localhost:8080/item/add', {
                 method: 'POST',
                 body: formData
                 })
                 .then(function(response) {
                     console.log(response.status); // Will show you the status
                     if (response.ok) {
                         alert("Successfully Added Product!");
                     }
                     else {
                        throw Error(response.statusText);
                     }
                 })
                 .catch((error) => {
                     console.error('Error:', error);
                     alert("Error adding item to To Do List")
                 });
        }

        //This method will do the fetch method to fetch data from database using
        //the REST API endpoint from Spring Boot
        displayTask()
        {
             let taskController = this;
             taskController._tasks = [];

             fetch('http://127.0.0.1:8080/item/all')        //12ms
                .then((resp) => resp.json())
                .then(function(data) {
                    console.log("2. receive data")
                    console.log(data);
                    data.forEach(function (task, index) {

                        const taskObj = {
                            taskId: task.taskId,
                            Title: task.Title,
                            Description: task.Description,
                            TargetDate: task.TargetDate,

                       };
                        taskController._tasks.push(taskObj);
                  });

                  taskController.renderTaskPage();

                })
                .catch(function(error) {
                    console.log(error);
                });

        }

        //Based on the item fetched from the displayItem() method and show the products in the
        //product page
        renderProductPage()
        {
            let productHTMLList = [];

            for (let i=0; i<this._tasks.length; i++)
            {
                const item = this._tasks[i];            //assign the individual item to the variable

                const productHTML = createHTMLList(i, item.name, item.description, item.imageUrl);

                taskHTMLList.push(taskHTML);
            }

            //Join all the elements/items in my productHTMLList array into one string, and seperate by a break
            const tHTML = taskHTMLList.join('\n');
            document.querySelector('#row').innerHTML = tHTML;


            //addEventListener - click
            for (let i=0; i<this._tasks.length; i++)
            {
                const item = this._tasks[i];
                document.getElementById(i).addEventListener("click", function() { displayProductDetails(task);} );
            }
        }


    }   //End of ProductsController class