import React from "react";
import { useEffect } from "react";
const Blogs = () => {



    const fetchBlogs=async()=>{
        try{

            const response = await fetch("http://localhost:8080/api/blogs");
            if (response == null) {
              return "nothing";
            } else {
              console.log(response.json());
            }
        }
        catch{
            console.log("error fetching");
        }
    }
  useEffect(async () => {
    fetchBlogs();
  }, []);

  return <div>Blogs</div>;
};

export default Blogs;
