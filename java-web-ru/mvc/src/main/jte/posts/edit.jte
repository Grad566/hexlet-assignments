@import exercise.dto.posts.EditPostPage
@param EditPostPage page

@template.layout.page(
    content = @`
        @if(page.getErrors() != null)
            <div>
                <ul>
                    @for(var validator : page.getErrors().values())
                        @for(var error : validator)
                            <li>${error.getMessage()}</li>
                        @endfor
                    @endfor
                </ul>
            </div>
        @endif

        <div>
            <form action="/posts/${page.getId()}" method="post">
                <div>
                    <label class="form-label">
                        Название
                        <input type="text" class="form-control" name="name" value="${page.getName()}" />
                    </label>
                </div>
                <div>
                    <label class="form-label">Содержание</label>
                    <textarea class="form-control" rows="20" cols="70" type="text" name="body">${page.getBody()}</textarea>
                </div>
                <input type="submit" class="btn btn-primary" value="Сохранить" />
            </form>
        </div>
    `
)
