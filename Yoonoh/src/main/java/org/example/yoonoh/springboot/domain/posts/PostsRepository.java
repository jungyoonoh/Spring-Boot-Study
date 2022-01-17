package org.example.yoonoh.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

// Dao라고 불리는 DB 접근자의 형태
// JPA에서는 Repository라고 부르며 인터페이스로 생성
// <Entity Class, PK Type>을 상속하면 기본적인 CRUD가 자동으로 생성됨
// Entity와 Repository는 반드시 같은 Directory에 있어야만 한다.
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
