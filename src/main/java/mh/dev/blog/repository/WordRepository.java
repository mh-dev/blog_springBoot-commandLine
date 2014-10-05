package mh.dev.blog.repository;

import mh.dev.blog.model.Word;

import org.springframework.data.repository.CrudRepository;

public interface WordRepository extends CrudRepository<Word, Long> {

	public Word findByText(String text);
}
