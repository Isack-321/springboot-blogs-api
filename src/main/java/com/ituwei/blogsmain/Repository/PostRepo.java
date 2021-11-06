package com.ituwei.blogsmain.Repository;

import com.ituwei.blogsmain.Entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post,Long> {


}
